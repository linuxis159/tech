import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';

import { useEffect, useState } from 'react';
import './App.css';
import MainContent from './components/MainContent';
import NavbarTag from './components/NavbarTag';


function App() {

return(
  <div>
    <NavbarTag/>
    <MainContent/>
  </div>
);

}

export default App;
