import { useState, useCallback } from "react";
import { api } from "../api/api.js";

export function use() {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const executecall = useCallback(async (apiCall) => {
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
        fetchAll: () => executecall(() => api.getAll()),
        fetchById: (id) => executecall(() => api.getById(id)),
        fetchByName: (name) => executecall(() => api.getByName(name)),
        fetchByWork: (id) => executecall(() => api.getByWork(id)),
        fetchByIdea: (id) => executecall(() => api.getByIdea(id)),
        fetchByCountry: (id) => executecall(() => api.getByCountry(id)),
        fetchByDiscipline: (id) => executecall(() => api.getByDiscipline(id)),
    };
}