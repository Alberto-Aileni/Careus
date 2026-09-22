import {useState, useCallback} from "react";
import {apiWork} from "../api/apiWork.js";

export function useWork() {
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
        fetchAll: () => executeCall( () => apiWork.getAll()),
        fetchById: (id) => executeCall( () => apiWork.getById(id)),
        fetchByName: (name) => executeCall( () => apiWork.getByName(name))
    }
}