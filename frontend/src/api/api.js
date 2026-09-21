import {apiResquest} from "./apiClient.js";

export const api = {

    getAll: () => apiResquest(`character/characters`),

    getById: (id) => apiResquest(`character/id/${id}`),

    getByName: (name) => apiResquest(`character/name/${encodeURIComponent(name)}`),

    getByWork: (id) => apiResquest(`character/work/${id}`),

    getByIdea: (id) => apiResquest(`character/idea/${id}`),

    getByCountry: (id) => apiResquest(`character/country/${id}`),

    getByDiscipline: (id) => apiResquest(`character/discipline/${id}`),

}