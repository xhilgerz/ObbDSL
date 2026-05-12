local CP2 = Instance.new("Part")
CP2.Name = "CP2"
CP2.Size = Vector3.new(4, 6, 4)
CP2.Parent = workspace
local CP2Script = Instance.new("Script")
CP2Script.Parent = CP2
CP2Script.Source = [[
local part = script.Parent
part.Touched:Connect(function(hit)
    local player = game.Players:GetPlayerFromCharacter(hit.Parent)
    if player then
        player.RespawnLocation = part
    end
end)
]]

