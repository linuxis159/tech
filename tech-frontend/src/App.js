import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';

import { useEffect, useState } from 'react';
import { Col, Container, Row } from 'react-bootstrap';
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import Article from './components/Article';

import NavbarTag from './components/NavbarTag';
import Sidebar from './components/Sidebar';


function App() {
  const [data,setData] = useState({
    title : "main",
    content : "mainContent",
    createdDate : Date.now
  });



 




return(
  <div>
 
    <NavbarTag setData={setData} data={data}/>
    <Container>
             <Row>

                 <Col xs={10}>
      
                    <Article data={data}/>
                    
                </Col>

                 <Col>
                      <Sidebar/>
                </Col>

             </Row>
        </Container>
  </div>
);

}

export default App;
