import React from 'react';
import Article from './Article';
import Sidebar from './Sidebar';
import { Col, Container, Row } from 'react-bootstrap';

const MainContent = () =>  {  
    return(
        <Container>
             <Row>

                 <Col xs={10}>
                     <Article/>
                </Col>

                 <Col>
                      <Sidebar/>
                </Col>

             </Row>

        </Container>

    );

}



export default MainContent;