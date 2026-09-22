import {apiResquest} from "./apiClient.js";

export const apiDiscipline = {

    getAll: () => apiResquest(`/discipline/disciplines`),

    getById: (id) => apiResquest(`/discipline/id/${id}`),

    getByName: (name) => apiResquest(`/discipline/name/${encodeURIComponent(name)}`),

    getByCharacter: (id) => apiResquest(`/discipline/character/${id}`),

}