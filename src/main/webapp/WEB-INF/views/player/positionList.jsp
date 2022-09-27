<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<c:forEach var="col" items="${playerPositionRespDto.colList}">
					<th>${col}</th>
				</c:forEach>
				<!-- for문을 돌려야함 -->
			</tr>
		</thead>
		<tbody>
			<!-- for문을 돌려야함 -->
			<c:forEach var="row" items="${playerPositionRespDto.rowList}">
				<tr>
					<c:forEach var="value" items="${row}">
						<td>${value}</td>
					</c:forEach>	
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>

<%@ include file="../layout/footer.jsp"%>

