local CP1 = Instance.new("Part")
CP1.Name = "CP1"
CP1.Size = Vector3.new(4, 6, 4)
CP1.Parent = workspace
local CP1Script = Instance.new("Script")
CP1Script.Parent = CP1
CP1Script.Source = [[
local part = script.Parent
part.Touched:Connect(function(hit)
    local player = game.Players:GetPlayerFromCharacter(hit.Parent)
    if player then
        player.RespawnLocation = part
    end
end)
]]

