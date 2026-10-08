import { useNavigate } from 'react-router-dom';

export function StartButton(){
    const navigate = useNavigate();

    return(
        <div>
            <button onClick={() => navigate(`/character/characters`)} style={{ cursor: "pointer"}} >Explore</button>
        </div>
    )
}