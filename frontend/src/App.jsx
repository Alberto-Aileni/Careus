import { useEffect } from 'react';
import { use } from './hooks/use.js';

export default function App() {
    const { data, loading, error, fetchAll } = use();

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