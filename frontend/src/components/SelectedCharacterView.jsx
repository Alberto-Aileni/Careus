

export function SelectedCharacterView({name, description, image, birthPlace, nacionalities, language, birthDate, passingDate, countrys, disciplines, works, ideas}){

    return(
        <section>
            <div>
                <img src={image}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
            <p>{birthPlace}</p>
            <p>{nacionalities}</p>
            <p>{language}</p>
            <p>{birthDate}</p>
            <p>{passingDate}</p>
            <p>{countrys}</p>
            <p>{disciplines}</p>
            <p>{works}</p>
            <p>{ideas}</p>
        </section>
    )
}