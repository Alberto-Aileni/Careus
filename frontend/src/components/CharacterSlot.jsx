

export function CharacterSlot({name, description, image}){
    return(
        <article>
            <div>
                <img src={image}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}