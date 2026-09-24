

export function SelectedDisciplineView({name, description, characters}){

    return(
        <section>
            <h1>{name}</h1>
            <p>{description}</p>
            <p>{characters}</p>
        </section>
    )
}