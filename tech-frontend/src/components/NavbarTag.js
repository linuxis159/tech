
import axios from 'axios';
import React, { useState } from 'react';
import { Button, Container, Form, FormControl, Nav, Navbar, NavDropdown, NavLink } from 'react-bootstrap';
import { Link, Router } from 'react-router-dom';







const NavbarTag = (props) => {


  const [word,setWord] = useState('');

  const SearchBox = (e) => {
    setWord(e.target.value);
  }

  const SearchWord = (e) => {
    props.setData({
      title : word
    });
  } 
   



    return (

        <Navbar bg="light" expand="lg">
        <Container fluid>
          <Navbar.Brand href="#">Navbar scroll</Navbar.Brand>
          <Navbar.Toggle aria-controls="navbarScroll" />
          <Navbar.Collapse id="navbarScroll">
            <Nav
              className="me-auto my-2 my-lg-0"
              style={{ maxHeight: '100px' }}
              navbarScroll
            >
              <Nav.Link href="#action1">Home</Nav.Link>
              <Nav.Link href="#action2">Link</Nav.Link>
              <NavDropdown title="Link" id="navbarScrollingDropdown">
                <NavDropdown.Item href="#action3">Action</NavDropdown.Item>
                <NavDropdown.Item href="#action4">Another action</NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item href="#action5">
                  Something else here
                </NavDropdown.Item>
              </NavDropdown>
              <Nav.Link href="/docs/" disabled>
                Link
              </Nav.Link>
            </Nav>
          </Navbar.Collapse>
          <Form className="d-flex">
              <FormControl
                onChange={SearchBox}
                type="search"
                placeholder="Search"
                className="me-2"
                aria-label="Search"
              />
     
              <Link to={"/docs/search/"+word} onClick={SearchWord}>
                  <Button id="word" type="submit" variant="outline-success">
                    search
                  </Button> 
              </Link>
    
              
    
          
          </Form> 
            <Nav.Link href="#action2">JOIN</Nav.Link>
        </Container>
      </Navbar>

    );
}

export default NavbarTag;