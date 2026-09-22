import { useEffect } from 'react';
import { useCharacter } from './hooks/useCharacter.js';

export default function App() {
    const { data, loading, error, fetchAll } = useCharacter();

    useEffect(() => {
        fetchAll();
    }, []);

    return (
        <div>
            <h1>characters</h1>


                <div>
                    <pre>
                        {JSON.stringify(data, null, 2)}
                    </pre>
                </div>

        </div>
    );
}