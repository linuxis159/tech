import axios from "axios";
import React, { useRef, useState } from "react";
import { Button, Form } from "react-bootstrap";
import "../css/writeDocs.css";


const CreateDocs = () => {
    const [request,setRequest] = useState({
        title : "",
        content : ""

    });
    const changeValue = (e) =>{
        setRequest({
            ...request,
            [e.target.name] : e.target.value
        });
        console.log(e.target.value);
    }
    const submit = (e) =>{
        e.preventDefault();
        axios.post("/docs/add",request)
        .then((res) => console.log(res));
    }    
    
    return (
        <Form onSubmit={submit}>
            <Form.Group>
                <Form.Control type="text" name="title" placeholder="제목" onChange={changeValue}></Form.Control>
            </Form.Group>
            <p></p>
            <Form.Group>
                <Form.Control className="contentForm" as="textarea" type="text" name="content" onChange={changeValue}></Form.Control>
            </Form.Group>
            <Button variant="primary" type="submit">
                 작성
            </Button>
        </Form>
    );

}

export default CreateDocs;