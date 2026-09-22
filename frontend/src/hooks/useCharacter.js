import {useState, useCallback} from "react";
import {apiCharacteri} from "../api/apiCharacteri.js";

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
        fetchAll: () => executeCall(() => apiCharacteri.getAll()),
        fetchById: (id) => executeCall(() => apiCharacteri.getById(id)),
        fetchByName: (name) => executeCall(() => apiCharacteri.getByName(name)),
        fetchByWork: (id) => executeCall(() => apiCharacteri.getByWork(id)),
        fetchByIdea: (id) => executeCall(() => apiCharacteri.getByIdea(id)),
        fetchByCountry: (id) => executeCall(() => apiCharacteri.getByCountry(id)),
        fetchByDiscipline: (id) => executeCall(() => apiCharacteri.getByDiscipline(id)),
    };
}