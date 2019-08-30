<%@ page pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

	</nav>
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb justify-content-end">
			<li class="breadcrumb-item"><a href="#">Home</a></li>
			<li class="breadcrumb-item active" aria-current="page">Library</li>
		</ol>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">공지사항</h5>

						<form class="form-horizontal" role="form">
							<div class="form-group row">
								<label class="col-form-label col-sm-2" for="inputName">작성자</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputName" placeholder="이름을 입력해 주세요">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-form-label col-sm-2" for="inputName">제목</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputName" placeholder="이름을 입력해 주세요">
								</div>
							</div>
							<div class="form-group row">
								<label class="col-form-label col-sm-2" for="inputName">제목</label>
								<div class="col-sm-10">
									<textarea class="form-control" id="inputName" placeholder="이름을 입력해 주세요"></textarea>
								</div>
							</div>

							<div class="form-group text-center">
								<button type="submit" id="join-submit" class="btn btn-primary">
									회원가입<i class="fa fa-check spaceLeft"></i>
								</button>
								<button type="submit" class="btn btn-warning">
									가입취소<i class="fa fa-times spaceLeft"></i>
								</button>
							</div>
						</form>

						<div class="text-right">
							<a href="" id = "modifyNotice" class="btn btn-outline-primary">수정</a>
							<a href="" id = "deleteNotice" class="btn btn-outline-danger">삭제</a>
							<a href="list.jsp" class="btn btn-outline-success">리스트</a>
						</div>

					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="../inc/footer.jsp"%>