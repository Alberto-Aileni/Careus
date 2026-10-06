import {useNavigate} from "react-router-dom";


export function NavBar(){
    const navigate = useNavigate();

    return(
        <article>
            <nav>
                <button onClick={() => navigate(`/`)} style={{ cursor: 'pointer' }}>home</button>

                <button onClick={() => navigate(`/character/characters`)} style={{ cursor: 'pointer' }}>characters</button>

                <button onClick={() => navigate(`/discipline/disciplines`)} style={{ cursor: 'pointer' }}>disciplines</button>

                <button onClick={() => navigate(`/country/countrys`)} style={{ cursor: 'pointer' }}>countrys</button>
            </nav>
        </article>
    )
}