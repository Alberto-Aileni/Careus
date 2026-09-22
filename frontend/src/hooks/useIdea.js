import {useState, useCallback} from "react";
import {apiIdea} from "../api/apiIdea.js";

export function useIdea() {
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
        fetchAll: () => executeCall( () => apiIdea.getAll()),
        fetchById: (id) => executeCall( () => apiIdea.getById(id)),
        fetchByName: (name) => executeCall( () => apiIdea.getByName(name)),
    }
}