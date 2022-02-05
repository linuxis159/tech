import React, { useEffect, useState } from "react";


import styled from "styled-components";
import SearchResult from "./SearchResult";
import Join from "./Join";
import { BrowserRouter, Route, Routes, useParams } from "react-router-dom";
import CreateDocs from "./CreateDocs";
import axios from "axios";


const ArticleArea = styled.div`
    padding : 2vw;
`;

const Title = styled.h1 ``;

const HeadContent = styled.div``;




const Article = (props) => {
    const [data,setData] = useState({
        title : "main",
        content : "mainContent",
        createdDate : Date.now
    });

    useEffect(() => {
        axios.get(window.location.href).then(res => {
            setData({
                title : res.data.title,
                content : res.data.content,
                date : res.data.createdDate

            },[data]);
        })
    })




        
    return (

            <ArticleArea>
                    
                <Title>
                  {data.title}
                </Title>

                <HeadContent>        
                <BrowserRouter>
                    <Routes>
                        <Route path="/join"  element={<Join/>} />
                        <Route path="/docs/search/:id" element={<SearchResult data={data.content} />} />
                        <Route path="/docs/create" element={<CreateDocs/>} />
                    </Routes>
                </BrowserRouter>
                </HeadContent>
            </ArticleArea>
  
    );
}


export default Article;