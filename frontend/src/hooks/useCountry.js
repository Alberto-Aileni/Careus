import {useState, useCallback} from "react";
import {apiCountry} from "../api/apiCountry.js";

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
        fetchAll: () => executeCall( () => apiCountry.getAll()),
        fetchById: (id) => executeCall( () => apiCountry.getById(id)),
        fetchByName: (name) => executeCall( () => apiCountry.getByName(name)),
        fetchByCharacter: (id) => executeCall( () => apiCountry.getByCharacter())
    }
}