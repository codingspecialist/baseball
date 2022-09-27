<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<select id="teamId" class="form-control">
				<c:forEach var="team" items="${teamList}">
					<option value="${team.id}">${team.name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="mb-3 mt-3">
			<input id="name" type="text" class="form-control" placeholder="Enter name">
		</div>
		<div class="mb-3 mt-3">
			<input id="position" type="text" class="form-control" placeholder="Enter position">
		</div>
		<button id="btnInsert" type="button" class="btn btn-primary">선수등록완료</button>
	</form>
</div>

<script>
	$("#btnInsert").click(()=>{
		insert();
	});
	
	function insert(){
		let data = {
				name: $("#name").val(),
				position: $("#position").val(),
				teamId: $("#teamId").val()
		}

		$.ajax("/player",{
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data), // http body에 들고갈 요청 데이터
			headers: { // http header에 들고갈 요청 데이터
				"Content-Type": "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code == 1){ // 성공
				location.href="/player";
			}else{ // 실패
				alert("선수등록에 실패하였습니다.");
			}
		});
	}
</script>

<%@ include file="../layout/footer.jsp"%>

