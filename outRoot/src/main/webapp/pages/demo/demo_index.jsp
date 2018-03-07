<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/pages/common/include.jsp" %>
<script src="${ctx}/pages/demo/demo.js"></script>
<div class="tabs-container">
    <div class="tab-pane active">
        <div class="panel-body">

            <div class="oper-bar">
                <div class="form-group">
                    <div class="col-sm-3">
                        <span class="input-group-btn">
                          	<button class="btn btn-success " type="button"  href="###" onclick="demo.add(this)"><i class="fa fa-plus"></i>&nbsp;&nbsp;<span class="bold">新建</span> </button>
                        </span>
                    </div>
                    <div class="col-sm-9">
                    <form id="queryForm">
                        <div class="input-group">
                                    <input name="Name" type="text" class="form-control" placeholder="名称"/>
                                    <span class="input-group-btn"></span>
                                    <input name="Age" type="text" class="form-control" placeholder="年龄"/>
                                    <span class="input-group-btn"></span>
                                    <input name="Name2" type="text" class="form-control" placeholder="c1"/>
                                    <span class="input-group-btn"></span>
                                    <input name="C2" type="text" class="form-control" placeholder="c2"/>
                                    <span class="input-group-btn"></span>
                                    <input name="C3" type="text" class="form-control" placeholder="c3"/>
                                    <span class="input-group-btn"></span>
                                    <input name="C4" type="text" class="form-control" placeholder="c4"/>
                                    <span class="input-group-btn"></span>
                                    <input name="C5" type="text" class="form-control" placeholder="名称2"/>
                                    <span class="input-group-btn"></span>
                                    <input name="C6" type="text" class="form-control" placeholder="c6"/>
                                    <span class="input-group-btn"></span>
                                    <input name="C7" type="text" class="form-control" placeholder="c7"/>
                                    <span class="input-group-btn"></span>
                             <span class="input-group-btn">
                                <button id="btn_search" type="button" class="btn btn-primary">搜索</button>
                            </span>
                        </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="tables_wrapper">
                <table id="tableService"
                       class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>序号</th>
                                <th sortColumn="name" >名称</th>
                                <th sortColumn="age" >年龄</th>
                                <th sortColumn="name2" >c1</th>
                                <th sortColumn="c2" >c2</th>
                                <th sortColumn="c3" >c3</th>
                                <th sortColumn="c4" >c4</th>
                                <th sortColumn="c5" >名称2</th>
                                <th sortColumn="c6" >c6</th>
                                <th sortColumn="c7" >c7</th>

                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody></tbody>
                    <!-- tbody是必须的 -->
                </table>
            </div>
        </div>
    </div>
</div>