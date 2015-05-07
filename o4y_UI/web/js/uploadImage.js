/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$('#multi_file_upload').change(function(e) {
    var file_id = e.target.id;

    var file_name_arr = new Array();
    var process_path = site_url + 'public/uploads/';

    for (i = 0; i < $("#" + file_id).prop("files").length; i++) {


        var form_data = new FormData();
        var file_data = $("#" + file_id).prop("files")[i];
        form_data.append("file_name", file_data);

        if (check_multifile_logo($("#" + file_id).prop("files")[i]['name'])) {
            $.ajax({
                //url         :   site_url + "inc/upload_image.php?width=96&height=60&show_small=1",
                url: site_url + "inc/upload_contact_info.php",
                cache: false,
                contentType: false,
                processData: false,
                async: false,
                data: form_data,
                type: 'post',
                success: function(data) {
                    // display image
                }
            });
        } else {
            $("#" + html_div).html('');
            alert('We only accept JPG, JPEG, PNG, GIF and BMP files');
        }

    }
});

function check_multifile_logo(file) {
    var extension = file.substr((file.lastIndexOf('.') + 1))
    if (extension == 'jpg' || extension == 'jpeg' || extension == 'gif' || extension == 'png' || extension == 'bmp') {
        return true;
    } else {
        return false;
    }
}

function previewFile(){
       var preview = document.getElementById('prev_img') //selects the query named img
       var file    = document.querySelector('input[type=file]').files[0]; //sames as here
       var reader  = new FileReader();
       reader.onloadend = function () {
           preview.src = reader.result;
       }

       if (file) {
           reader.readAsDataURL(file); //reads the data as a URL
       } else {
           preview.src = "";
       }
  }
previewFile();
