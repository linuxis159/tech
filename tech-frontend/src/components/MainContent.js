import React, { useState } from 'react';
import Article from './Article';
import Sidebar from './Sidebar';
import { Col, Container, Row } from 'react-bootstrap';
import { Route, Routes } from 'react-router-dom';

const MainContent = (props) =>  {

    return(
        <Container>
             <Row>

                 <Col xs={10}>
      
                    <Article data={props.data}/>
                    
                </Col>

                 <Col>
                      <Sidebar/>
                </Col>

             </Row>

        </Container>

    );

}



export default MainContent;