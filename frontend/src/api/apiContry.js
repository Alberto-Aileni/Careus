import {apiResquest} from "./apiClient.js";

export const apiContry = {

    getAll: () => apiResquest(`/country/countrys`),

    getById: (id) => apiResquest(`/country/id/${id}`),

    getByName: (name) => apiResquest(`/country/name/${encodeURIComponent(name)}`),

    getByCharacter: (id) => apiResquest(`/country/character/${id}`),

}