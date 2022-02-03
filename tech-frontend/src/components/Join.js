import React, { useState } from "react";
import { Button, Form } from "react-bootstrap";
import axios from "axios";



const Join = () => {
    const [request,setRequest] = useState({
        email : "",
        id : "",
        password : "",
        passwordConform : ""
    
    });
    const changeValue = (e) => {
        setRequest({
            ...request,
            [e.target.name] : e.target.value
        });
    }

    const requestJoin = (e) => {
        e.preventDefault();
        axios.post('/join',request
        ).then((res) => {
            console.log(res);
        }).catch((err) =>{
            console.log(err);
        })
    }
    return(
  <Form onSubmit={requestJoin}>
    <Form.Group className="mb-3" controlId="formBasicEmail">
        <Form.Label>id</Form.Label>
        <Form.Control type="textl" placeholder="id" name="id" onChange={changeValue}/>
        <Form.Text className="text-muted">
        We'll never share your email with anyone else.
        </Form.Text>
    </Form.Group>

    <Form.Group className="mb-3">
        <Form.Label>password</Form.Label>
        <Form.Control type="password" placeholder="password" name="password" onChange={changeValue}/>
        <Form.Text className="text-muted">
        We'll never share your email with anyone else.
        </Form.Text>
    </Form.Group>


    <Form.Group className="mb-3" controlId="formBasicPassword">
        <Form.Label>password Conform</Form.Label>
        <Form.Control type="password" placeholder="password conform" name="passwordConform" onChange={changeValue}/>
    </Form.Group>

    <Form.Group className="mb-3">
        <Form.Label>email</Form.Label>
        <Form.Control type="email" placeholder="email" name="email" onChange={changeValue}/>
        <Form.Text className="text-muted">
        We'll never share your email with anyone else.
        </Form.Text>
    </Form.Group>



    <Form.Group className="mb-3" controlId="formBasicCheckbox">
        <Form.Check type="checkbox" label="Check me out" />
    </Form.Group>

    <Button variant="primary" type="submit">
        Submit
    </Button>

    </Form>

    );
}

export default Join;