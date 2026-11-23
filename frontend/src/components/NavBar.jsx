import {useNavigate} from "react-router-dom";
import { NavLink, Link } from "react-router-dom";
import "./NavBar.css"

export function NavBar(){
    const navigate = useNavigate();

    return(
        <article>
            <nav className="nav">
                <Link to="/" className="nav-logo">Careus</Link>
                <div className="nav-links">
                    <NavLink onClick={() => navigate(`/`)}>home</NavLink>

                    <NavLink onClick={() => navigate(`/character/characters`)}>characters</NavLink>

                    <NavLink onClick={() => navigate(`/discipline/disciplines`)}>disciplines</NavLink>

                    <NavLink onClick={() => navigate(`/country/countrys`)}>countrys</NavLink>
                </div>
            </nav>
        </article>
    )
}