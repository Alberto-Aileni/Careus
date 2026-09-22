import {apiResquest} from "./apiClient.js";

export const apiWork = {

    getAll: () => apiResquest(`/work/works`),

    getById: (id) => apiResquest(`/work/id/${id}`),

    getByName: (name) => apiResquest(`/work/name/${encodeURIComponent(name)}`),

}