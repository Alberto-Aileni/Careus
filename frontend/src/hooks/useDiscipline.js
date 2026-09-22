import {useState, useCallback} from "react";
import {apiDiscipline} from "../api/apiDiscipline.js";

export function useDiscipline() {
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
        fetchAll: () => executeCall( () => apiDiscipline.getAll()),
        fetchById: (id) => executeCall( () => apiDiscipline.getById(id)),
        fetchByName: (name) => executeCall( () => apiDiscipline.getByName(name)),
        fetchByCharacter: (id) => executeCall( () => apiDiscipline.getByCharacter(id))
    }

}