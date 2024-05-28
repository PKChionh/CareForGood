import { Link, Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import './App.css';
import HomeComponent from './components/HomeComponent';

function App() {
  return (
    <div>
    <Router>
      <div>
        <nav>
          <ul>
            <li><Link to="/">Home</Link></li>
          </ul>
        </nav>

        <Routes>
{/*          <Route path="/about"><About /></Route>
          <Route path="/users"><Users /></Route>
*/}          
          <Route path="/" element={<HomeComponent />} />
        </Routes>
      </div>
    </Router>

    </div>
  );
}

export default App;
