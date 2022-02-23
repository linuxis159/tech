
import axios, { Axios } from 'axios';
import React, { useEffect, useState } from 'react';
import { useHisotry, useNavigate } from 'react-router-dom';

import styled from 'styled-components';




const OutlineArea = styled.div`

    display: inline-box;
    border: 1px solid;
    margin-top :5vh;
    padding:2vw;

`;

const ContentArea = styled.div`
    margin-top:5vh;
`;

const OutlineWord = styled.h2`
    margin-top :5vh;
    margin-bottom: 5vh;
`

const Paragraph = styled.div`
    display : inline-box;
`


const SearchResult = (props) => {

    const navigate = useNavigate();

    const [docs, setDocs] = useState({
        title : "",
        paragraphs : [],
        createdDate : null, 
        flag : null
    });
    useEffect(() => {
        axios.get(window.location.href).then(res => {
            setDocs(res.data);
            console.log(res.data);
        });
        if(docs.flag === 0){
            // props.history.go("/docs/empty");
            // navigate("/");
        }


    },[props.data]);
    const outline = docs.paragraphs.map(content => {
        return(
            <li>{content.title}</li>
        ) 
    });
    
    const contents = docs.paragraphs.map (content  => {
        return (
            <div>
                <h1>{content.title}</h1>
                <div dangerouslySetInnerHTML={{__html: content.article}}></div>
                <p></p>
            </div>
            

        )
        
    })


    return (

    <div>

        <OutlineArea>
            <ul>
                {outline}
            </ul>
        </OutlineArea>

        <ContentArea>
            
             <OutlineWord>

            </OutlineWord>

            <Paragraph>
               {contents} 
            
            </Paragraph>

        </ContentArea>

    </div>

    );
}

export default SearchResult;