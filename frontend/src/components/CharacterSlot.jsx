

export function CharacterSlot({id, name, description, image}){
    const navigate = useNavigate();

    const handleClick = () => {
        navigate(`/character/${id}`);
    };

    return(
        <article onClick={handleClick}>
            <div>
                <img src={image}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}