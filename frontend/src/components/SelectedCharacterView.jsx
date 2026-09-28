

export function SelectedCharacterView({name, description, image, birthPlace, nacionalities, language, birthDate, passingDate, countrys, disciplines, works, ideas}){
    const { id } = useParams();
    const { data: character, fetchById, loading, error } = useCharacter();

    useEffect(() => {
        if (id) {
            fetchById(id);
        }
    }, [id]);


    return(
        <section>
            <div>
                <img src={character.image}/>
            </div>
            <h1>{character.name}</h1>
            <p>{character.description}</p>
            <p>{character.birthPlace}</p>
            <p>{character.nacionalities}</p>
            <p>{character.language}</p>
            <p>{character.birthDate}</p>
            <p>{character.passingDate}</p>
            <p>{character.countrys}</p>
            <p>{character.disciplines}</p>
            <p>{character.works}</p>
            <p>{character.ideas}</p>
        </section>
    )
}