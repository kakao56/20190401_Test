<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1">
		<colgroup>
			<col width="100px;">
			<col width="200px;">
			<col width="150px;">
			<col width="150ox;">
			<col width="100px;">
		</colgroup>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody align="center">
			<c:choose>
				<c:when test="${list ne null}">
					<c:forEach items="${list }" var="item" >
						<tr>
							<td>${item.seq}</td>
							<td><a href="javascript:;"><c:out value=" ${item.subject}"></c:out></a></td>
							<td><c:out value=" ${item.id}(${item.name})"></c:out></td>
							<td>${item.rDate}</td>
							<td>${item.vCnt}</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">검색된 게시물이 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	${pageCode}