import {useNavigate} from "react-router-dom";


export function CountrySlot({id ,name, description, flag}){
    const navigate = useNavigate();

    return(
        <article onClick={() => navigate(`/country/${id}`) } style={{ cursor: 'pointer' }}>
            <div>
                <img src={flag}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}