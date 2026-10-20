import { useNavigate } from 'react-router-dom';
import './StartButton.css';

export function StartButton(){
    const navigate = useNavigate();

    return(
        <div>
            <button className="start-button" onClick={() => navigate(`/character/characters`)} style={{ cursor: "pointer"}} >Explore</button>
        </div>
    )
}