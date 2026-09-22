import {useState, useCallback} from "react";
import {apiContry} from "../api/apiContry.js";

export function useCountry() {
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
        fetchAll: () => executeCall( () => apiContry.getAll()),
        fetchById: (id) => executeCall( () => apiContry.getById(id)),
        fetchByName: (name) => executeCall( () => apiContry.getByName(name)),
        fetchByCharacter: (id) => executeCall( () => apiContry.getByCharacter())
    }
}