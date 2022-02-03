import React from "react";


import styled from "styled-components";
import SearchResult from "./SearchResult";
import Join from "./Join";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import CreateDocs from "./CreateDocs";


const ArticleArea = styled.div`
    padding : 2vw;
`;

const Title = styled.h1 ``;

const HeadContent = styled.div``;



const Article = () => {
    return (

            <ArticleArea>

                <Title>
                    Java
                </Title>

                <HeadContent>        
                <BrowserRouter>
                    <Routes>
                        <Route path="/join"  element={<Join/>} />
                        <Route path="/search" element={<SearchResult/>} />
                        <Route path="/docs/create" element={<CreateDocs/>} />
                    </Routes>
                </BrowserRouter>
                </HeadContent>
   
            </ArticleArea>
  
    );
}


export default Article;