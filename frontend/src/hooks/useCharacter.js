import {useState, useCallback} from "react";
import {apiCharacter} from "../api/apiCharacter.js";

export function useCharacter() {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const executeCall = useCallback(async (apiCall) => {
        setLoading(true);
        setError(null);
        try {
            const result = await apiCall();
            setData(result);
        } catch (err) {
            setError(err.message || "Data fetching error");
            setData(null);
        } finally {
            setLoading(false);
        }
    }, []);

    return {
        data,
        loading,
        error,
        fetchAll: () => executeCall(() => apiCharacter.getAll()),
        fetchById: (id) => executeCall(() => apiCharacter.getById(id)),
        fetchByName: (name) => executeCall(() => apiCharacter.getByName(name)),
        fetchByWork: (id) => executeCall(() => apiCharacter.getByWork(id)),
        fetchByIdea: (id) => executeCall(() => apiCharacter.getByIdea(id)),
        fetchByCountry: (id) => executeCall(() => apiCharacter.getByCountry(id)),
        fetchByDiscipline: (id) => executeCall(() => apiCharacter.getByDiscipline(id)),
    };
}