import {useEffect} from "react";
import {useDiscipline} from "../hooks/useDiscipline.js";
import {SectionTitle} from "./SectionTitle.jsx";
import {DisciplineSlot} from "./DisciplineSlot.jsx";

export function DisciplinesView(){
    const { data, fetchAll, error, loading } = useDiscipline();

    useEffect(() => {
            fetchAll();
        },
        []
    )
    return (
        <section>
            <div>
                <SectionTitle/>
            </div>
            <div>
                {data && data.map((discipline) => (
                    <DisciplineSlot
                        key={discipline.id}
                        id={discipline.id}
                        name={discipline.name}
                        description={discipline.description}
                        image={discipline.image}
                    />
                    ))}
            </div>
        </section>
    )
}