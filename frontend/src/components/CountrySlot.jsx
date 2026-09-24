

export function CountrySlot({id ,name, description, flag}){

    return(
        <article>
            <div>
                <img src={flag}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
        </article>
    )
}