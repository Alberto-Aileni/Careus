

export function SelectedCountryView({name, description, flag, formationDate, dismatleDate, characters}){

    return(
        <section>
            <div>
                <img src={flag}/>
            </div>
            <h1>{name}</h1>
            <p>{description}</p>
            <p>{formationDate}</p>
            <p>{dismatleDate}</p>
            <p>{characters}</p>
        </section>
    )
}