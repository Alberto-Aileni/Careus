import {useNavigate} from "react-router-dom";


export function CountrySlot({id ,name, description, image}){
    const navigate = useNavigate();

    return(
        <article onClick={() => navigate(`/country/${id}`) } style={{ cursor: 'pointer' }}>
            <div className="card">
                <img src={image}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}