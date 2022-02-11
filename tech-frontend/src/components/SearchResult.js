
import axios, { Axios } from 'axios';
import React, { useEffect, useState } from 'react';
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
    const [docs, setDocs] = useState({
        title : "",
        content : "",
        createdDate : null 
    });

    useEffect(() => {
        axios.get(window.location.href).then(res => {
            setDocs(res.data);
        });
        props.setTitle({
            title : docs.title 
        });

    },[props.data]);



    return (
    <div>

        <OutlineArea>
            <ul>
                <li>1sdfsdf</li>
                <li>2sdddf</li>
                <li>3sdfsdf</li>
            </ul>
        </OutlineArea>

        <ContentArea>
            
             <OutlineWord>
                목차
            </OutlineWord>

            <Paragraph>
               <div  dangerouslySetInnerHTML={{__html: docs.content}}></div> 
                hello
            </Paragraph>

        </ContentArea>

    </div>

    );
}

export default SearchResult;