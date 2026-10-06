import {useNavigate} from "react-router-dom";


export function DisciplineSlot({id, name, description}){
    const navigate = useNavigate();

    return(
        <article onClick={() => navigate(`/discipline/${id}`)} style={{ cursor: "pointer"}}>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}