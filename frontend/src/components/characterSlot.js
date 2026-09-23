

export function characterSlot({name, description, image}){
    return(
        <article>
            <div>
                <img scr={{image}}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}