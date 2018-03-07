<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/pages/common/include.jsp" %>
<div class="modal-dialog">
    <div class="modal-content animated bounceInRight">

        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span
                    class="sr-only">关闭</span>
            </button>
            <h4 class="modal-title">${title}</h4>
        </div>
        <div class="modal-body">
            <form class="form-horizontal" id="commentForm">
                <input type="hidden" name="id" value="${demo.id}">
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>名称 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="name" value="${demo.name}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>年龄 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="age" value="${demo.age}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>c1 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="name2" value="${demo.name2}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>c2 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="c2" value="${demo.c2}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>c3 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="c3" value="${demo.c3}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>c4 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="c4" value="${demo.c4}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>名称2 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="c5" value="${demo.c5}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>c6 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="c6" value="${demo.c6}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label"><span class="star">*</span>c7 ：</label>
                    <div class="col-sm-8">
                        <input type="text"  name="c7" value="${demo.c7}" placeholder="" class="form-control" required="" aria-required="true" maxlength="20">
                    </div>
                </div>
            </form>

        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
            <button type="submit" class="btn btn-primary" id="btn-save">保存</button>
        </div>
    </div>
</div>
<script>
    $(function () {
        var validator = $("#commentForm").validate();
        $("#btn-save").click(function(){
            if(validator.form()){
                demo.save();
            }
        });
    });
</script>