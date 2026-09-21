const BASE_URL = "http://localhost:8080";

export const apiResquest = async (endpoint) => {
    const cleanEndpoint = endpoint.startsWith('/') ? endpoint.slice(1) : endpoint;

    const response = await fetch(`${BASE_URL}/${cleanEndpoint}`, {
        headers: {
            "Content-Type": "application/json"
        },
    });

    if (!response.ok) {
        throw new Error(`Error HTTP ${response.status}: ${response.statusText}`);
    }

    return await response.json();
};