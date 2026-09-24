

export function workSlot({name, description, language, creation_date}){

    return(
        <section>
            <h1>{name}</h1>
            <p>{description}</p>
            <p>{language}</p>
            <p>{creation_date}</p>
        </section>
    )

}