import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import {useDiscipline} from "../hooks/useDiscipline.js";

export function SelectedDisciplineView({name, description}){
    const { id } = useParams();
    const navigate = useNavigate();
    const { data: discipline, fetchById, loading, error } = useDiscipline();

    useEffect(() => {
        if (id) {
            fetchById(id);
        }
    }, [id]);

    if (!discipline) {
        return null;
    }

    return(
        <section>
            <div>
                <button onClick={() => navigate("/")} style={{ cursor: "pointer"}}>Volver</button>
            </div>
            <h1>{discipline.name}</h1>
            <p>{discipline.description}</p>
        </section>
    )
}