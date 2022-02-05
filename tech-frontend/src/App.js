import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';

import { useEffect, useState } from 'react';
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import MainContent from './components/MainContent';
import NavbarTag from './components/NavbarTag';


function App() {
  const [data,setData] = useState({
    title : "main",
    content : "mainContent",
    createdDate : Date.now
  });



 




return(
  <div>
    <BrowserRouter>
      <NavbarTag setData={setData}/>
    </BrowserRouter>
    <MainContent data={data}/>
  </div>
);

}

export default App;
