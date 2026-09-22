import {apiResquest} from "./apiClient.js";

export const apiIdea = {

    getAll: () => apiResquest(`/idea/ideas`),

    getById: (id) => apiResquest(`/idea/id/${id}`),

    getByName: (name) => apiResquest(`/idea/name/${encodeURIComponent(name)}`),

}